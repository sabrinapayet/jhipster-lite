import { Project } from '@/springboot/domain/Project';
import ProjectRepository from '@/springboot/secondary/ProjectRepository';
import { stubAxiosHttp } from '../../http/AxiosHttpStub';

export const createProject = (project?: Partial<Project>): Project => ({
  folder: 'folder/path',
  baseName: 'beer',
  projectName: 'Beer Project',
  packageName: 'tech.jhipster.beer',
  serverPort: 8080,
  ...project,
});

export const createStubedProjectRepository = (resolve?: any): [ProjectRepository, any] => {
  const axiosHttpStub = stubAxiosHttp();
  axiosHttpStub.post.resolves(resolve);
  const projectRepository = new ProjectRepository(axiosHttpStub);
  return [projectRepository, axiosHttpStub];
};